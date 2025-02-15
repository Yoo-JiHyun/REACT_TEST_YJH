package com.aloha.todo.service;

import com.aloha.todo.domain.Todos;
import com.github.pagehelper.PageInfo;

public interface TodoService extends BaseService<Todos>{
    
    public PageInfo<Todos> list(int page, int size);

    // 전체 완료
    public boolean completeAll() throws Exception;

    // 전체 삭제
    public boolean deleteAll() throws Exception;
}
