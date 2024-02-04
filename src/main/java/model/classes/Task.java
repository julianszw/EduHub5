package model.classes;

import enums.TaskType;

import java.time.LocalDate;

public class Task {
	private TaskType type;
	private boolean isGroupTask;
	private String description;
	private LocalDate startDate;
	private LocalDate endDate;
}