package com.anhdoanthingoc.finalexam.backend.datalayer;

import java.util.List;

public interface Dao<T> {
	public List<T> getAll();

	public boolean insert(T t);

	public boolean update(T t);

	public boolean delete(T t);

}
