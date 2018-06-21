package by.epam.preTraining.alexdyagel.tasks.task10.controller;

import by.epam.preTraining.alexdyagel.tasks.task10.model.NegativePowerException;
import by.epam.preTraining.alexdyagel.tasks.task10.model.RecursionLogic;
import by.epam.preTraining.alexdyagel.tasks.task10.view.ConsoleView;

public class TaskTester {

    public static void main(String[] args) throws NegativePowerException {
        long number = 123;
        ConsoleView.print("Find sum of digits of number " + number + " --> " + RecursionLogic.findSumOfDigits(number));

        number = 5;
        int power = 6;
        ConsoleView.print("Number " + number + " in " + power + " power --> " + RecursionLogic.pow(number, power));

        number = 123456;
        int number2 = 21;
        ConsoleView.print("Sum of digits of number " + number + " equals to " + number2 + " --> "
                + RecursionLogic.equals(number, number2));

        int index = 10;
        ConsoleView.print("Fibonacci number with index " + index + " --> " + RecursionLogic.findFibonacciNumber(index));

        int circlesNumber = 4;
        char from = 'A';
        char buff = 'B';
        char to = 'C';

        ConsoleView.print("Decision of Hanoi Tower with " + circlesNumber + " circles:");
        RecursionLogic.solveHanoiTower(circlesNumber, from, buff, to);
    }
}
