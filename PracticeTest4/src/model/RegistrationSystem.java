package model;

public class RegistrationSystem {
	
	Transcript[] transcripts = new Transcript[500];
	private int transcriptNumber = 0;
	
	public RegistrationSystem() {
		
	}
	
	public void addTranscript(Transcript t) {
		transcripts[transcriptNumber] = t;
		transcriptNumber++;
	}
	
	
	public Transcript[] getReport() {
		Transcript[] tscripts = new Transcript[transcriptNumber];
		
		for (int i = 0 ; i < transcriptNumber ; i++) {
			tscripts[i] = transcripts[i];
		}
		return tscripts;
	}
	
	public int getMarks(String id, String name) {
		int tscriptIndex = -1;
		
		for (int i = 0 ; i < transcriptNumber ; i++) {
			if (transcripts[i].getStudentID() == id) {
				tscriptIndex = i;
			}
		}
		
		if (tscriptIndex == -1) {
			return -1;
		}else {
			return transcripts[tscriptIndex].getMarks(name);
		}	
	}
}
