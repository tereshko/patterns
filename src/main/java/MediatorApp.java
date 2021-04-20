public class MediatorApp {

    public static void main(String[] args) {
        RoleArch roleArch = new RoleArch();
        RoleD roleD = new RoleD();
        RoleDev roleDev = new RoleDev();
        RoleQA roleQA = new RoleQA();

        BuildingTheApp buildingTheApp = new BuildingTheAppImpl();

        //add team members
        buildingTheApp.addMember(roleArch);
        buildingTheApp.addMember(roleDev);
        buildingTheApp.addMember(roleQA);
        buildingTheApp.addMember(roleD);

        //what team members should to do
        roleArch.action(Action.Architecture);
        roleDev.action(Action.Developing);
        roleQA.action(Action.Testing);
        roleD.action(Action.Deploy);

    }



}
