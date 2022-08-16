package by.tms.storage;

import by.tms.entity.Operation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Simon Pirko on 21.07.22
 */
public class InMemoryOperationStorage {
	private static final List<Operation> operations = new ArrayList<>();

	public void save(Operation operation){
		operations.add(operation);
	}
}
