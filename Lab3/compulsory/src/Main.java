//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    Person daniel = new Person(123,"Daniel");
    Person cosmin = new Person(124,"Cosmin");
    Person razvan = new Person(125,"Razvan");
    Person miruna = new Person(126,"Miruna");

    Company lidl = new Company(512, "Lidl");
    Company kaufland = new Company(513, "Kaufland");

    List<Profile>  profiles = new ArrayList<>();
    profiles.add(daniel);
    profiles.add(cosmin);
    profiles.add(razvan);
    profiles.add(miruna);
    profiles.add(lidl);
    profiles.add(kaufland);

    SocialNetwork socialNetwork = new SocialNetwork(profiles);

    cosmin.addRelationship(daniel,relationship.FRIENDSHIP);
    cosmin.addRelationship(razvan,relationship.FRIENDSHIP);

    SocialNetwork.sortProfiles();
    SocialNetwork.printProfiles();



}
