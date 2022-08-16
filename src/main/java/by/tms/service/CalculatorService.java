package by.tms.service;

import by.tms.entity.Operation;
import by.tms.storage.InMemoryOperationStorage;

/**
 * @author Simon Pirko on 21.07.22
 */
public class CalculatorService {

	private final InMemoryOperationStorage inMemoryOperationStorage = new InMemoryOperationStorage();
	public Operation calculate(Operation operation){
		double result = 0;
		switch (operation.getOperation()) {
		case "sum":
			result = operation.getNum1() + operation.getNum2();
			break;
		case "sub":
			result = operation.getNum1() - operation.getNum2();
			break;
		case "mul":
			result = operation.getNum1() * operation.getNum2();
			break;
		case "div":
			result = operation.getNum1() / operation.getNum2();
			break;
		default:
			break;
		}
		operation.setResult(result);
		inMemoryOperationStorage.save(operation);
		return operation;
	}
}
