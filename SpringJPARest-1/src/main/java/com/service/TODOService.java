package com.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Todo;

@Service
public class TODOService {
	private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;

	/*
	 * static { todos.add(new Todo(1, "Madhu", "Learn Spring MVC", new
	 * Date(),false)); todos.add(new Todo(2, "Madhulika", "Learn RestAPI", new
	 * Date(), false)); todos.add(new Todo(3, "Madhuri", "Learn Hibernate", new
	 * Date(),false)); }
	 */

    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : todos) {
            if (todo.getUser().equals(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

    public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
        todos.add(new Todo(++todoCount, name, desc, targetDate, isDone));
    }

    public void deleteTodo(int id) {
        Iterator<Todo> iterator = todos.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getId() == id) {
                iterator.remove();
            }
        }
    }

}
