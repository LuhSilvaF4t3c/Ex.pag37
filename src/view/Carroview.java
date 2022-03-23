package view;

import java.util.concurrent.Semaphore;

import controller.CarroController;

public class Carroview {

	public static void main(String[] args) {
		Semaphore semaforo = new Semaphore(1);
		for (int threadId = 1; threadId <= 4; threadId++) {
			
			Thread threadP = new CarroController(threadId,semaforo);
			threadP.start();
		}

	}

}
