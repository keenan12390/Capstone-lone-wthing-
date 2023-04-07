package za.ac.cput.repository;

/*
* IRepository.java
* Author: Timothy Lombard (220154856) and Dawood Kamalie (220147760) added the interface
* Date: 7th April 2023
* */
public interface IRepository<T, ID> {
    // Contains crud methods
    T create(T t);
    T read(ID id); // Read by id
    T update(T t);
    boolean delete(ID id);  // Delete by id
}
