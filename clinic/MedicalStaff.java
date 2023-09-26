package clinic;

public class MedicalStaff {
    private String name;
    private String speciality;
    private PersonnelCategory personnelCategory;
    private final String TYPE = this.getClass().getSimpleName();

    public MedicalStaff(){

    }

    public MedicalStaff(String name, PersonnelCategory personnelCategory, String speciality){
        this.name = name;
        this.personnelCategory = personnelCategory;
        this.speciality = speciality;
    }

    public String getName(){
        return name;
    }

    public String getSpeciality(){
        return speciality;
    }

    public PersonnelCategory getPersonnelCategory(){
        return personnelCategory;
    }

    public void primaryMedicalExaminationPatient(){
        toVisualExaminationPatient();
        toMeasureTemperature();
        toPalpatePatient();
        toTakingPatientBloodTest();
    }

    public void toHaveAnOperation(){
        if(!(this.TYPE.equals(Doctor.class.getSimpleName()))){
            System.out.println(this.TYPE + " не может проводить операцию!");
        }else{
            System.out.println(this.TYPE + " проводит операцию!");
            toGiveAnesthesiaToPatient();
            toPerformsOperationOnPatient();
        }
        

    }

    private void  toVisualExaminationPatient(){
        System.out.println(this.TYPE + " осматривает пациента.");
    }

    private void  toMeasureTemperature(){
        System.out.println(this.TYPE + " измеряет температуру.");
    }

    private void  toPalpatePatient(){
        System.out.println(this.TYPE + " пальпирует пациента.");
    }

    private void  toTakingPatientBloodTest(){
        System.out.println(this.TYPE + " берет кровь на анализ.");
    }

    private void  toMedicalRecordEntry(){
        System.out.println(this.TYPE + " записывает информацию о пациенте в медкарту.");
    }

    private void  toGiveAnesthesiaToPatient(){
        System.out.println(this.TYPE + " делает анестезию.");
    }


    private void  toPerformsOperationOnPatient(){
        System.out.println(this.TYPE + " делает операцию.");
    }


}