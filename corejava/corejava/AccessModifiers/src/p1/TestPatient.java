package p1;

public class TestPatient {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.setId(1);
        patient.setName("The name");
        patient.setSsn("AVDC125");
        System.out.println("Patient id="+patient.getId());
        System.out.println("Patient name="+patient.getName());
        System.out.println("Patient ssn="+patient.getSsn());
    }
}
