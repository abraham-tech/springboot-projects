package net.javaguides.todomanagement.service.impl;

import net.javaguides.todomanagement.dto.TodoDto;
import net.javaguides.todomanagement.service.TodoService;

import java.util.List;

public class TodoServiceImpl implements TodoService {
    @Override
    public TodoDto addTodo(TodoDto todoDto) {
        return null;
    }

    @Override
    public TodoDto getTodo(Long id) {
        return null;
    }

    @Override
    public List<TodoDto> getAllTodos() {
        return List.of();
    }

    @Override
    public TodoDto updateTodo(TodoDto todoDto, Long id) {
        return null;
    }

    @Override
    public void deleteTodo(Long id) {

    }

    @Override
    public TodoDto completeTodo(Long id) {
        return null;
    }

    @Override
    public TodoDto inCompleteTodo(Long id) {
        return null;
    }
}
