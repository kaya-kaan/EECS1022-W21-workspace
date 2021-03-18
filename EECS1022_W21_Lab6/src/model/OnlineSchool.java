package model;

public class OnlineSchool {

	public Participant[] participants = new Participant[100];
	int participantCounter = 0;

	public Participant[] getParticipants(String name) {
		int count = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 5; j++) {
				if (participants[i].registrations[j].title == name) {
					count++;
				}
			}
		}

		Participant[] output = new Participant[count];
		count = 0;

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 5; j++) {
				if (participants[i].registrations[j].title == name) {
					output[count] = participants[i];
					count++;
				}
			}
		}
		return output;
	}

	public void addParticipant(Participant participant) {

		if (participantCounter < 100) {
			participants[participantCounter] = participant;
			participantCounter++;
		}

	}

}
