import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataGenerator {
    Random random=new Random();
    public Person generatePerson(){
        String namelist []={"Abel","Ada","Adolf","Agapit","Doris","Dorota","Drogomir","Eliasz","Elmira","Sara","Serafin","Sobiesław"};
        String surnamelist []={"Kowalski","Nowak", "Wiśniewski", "Wójcik", "Kowalczyk", "Kamiński", "Lewandowski", "Szczęsny", "Szymański", "Dąbrowski", "Woźniak", "Mazur"};
        String joblist[]={"Lekarz", "Nauczyciel", "Inżynier", "Prawnik", "Mechanik", "Programista", "Architekt", "Kucharz", "Kierowca", "Fryzjer", "Policjant", "Sprzedawca"};
        String genderlist []={"Kobieta","Mężczyzna","Osoba Niebinarna","genderfluid"};
        String name= namelist[random.nextInt(namelist.length)];
        String surname= surnamelist [random.nextInt(surnamelist.length)];
        String sex= genderlist [random.nextInt(genderlist.length)];
        int bornYear= random.nextInt(1950,2025);
        String job=joblist [random.nextInt(joblist.length)];;
        Company company=generateCompany();
        double salary= random.nextDouble(3000,20000);
        Address address=generateAddress();

        return new Person(name,surname,sex,bornYear,job,company,salary,address);
    }
    private Company generateCompany(){
        String[] namelist = {"Orlen", "Lotos", "Allegro", "PKO Bank Polski", "PZU", "Biedronka", "Żabka", "KGHM", "LOT", "CCC", "Play", "Polpharma"};
        String name=namelist[random.nextInt(namelist.length)];
        int year =random.nextInt(1997,2024);

        return new Company(name,year);
    }


    private Address generateAddress(){
        String streetlist[]={ "Warszawska", "Krakowska", "Świętokrzyska", "Mickiewicza", "Sienkiewicza", "Kościuszki", "Piłsudskiego", "Długa", "Krótka", "Wrocławska", "Główna", "Polna"};
        String citylist[]={"Warszawa", "Kraków", "Wrocław", "Poznań", "Gdańsk", "Łódź", "Katowice", "Lublin", "Szczecin", "Bydgoszcz", "Białystok", "Rzeszów"};
        String countrylist[]={ "Polska", "Niemcy", "Francja", "Włochy", "Hiszpania", "Norwegia", "Szwecja", "USA", "Kanada", "Japonia", "Chiny", "Brazylia"};

        String street=streetlist[random.nextInt(streetlist.length)];
        int flatNo= random.nextInt(1,300);
        int houseNo= random.nextInt(1,100);
        String postalCode=random.nextInt(10,99)+"-"+ random.nextInt(100,999);
        String city=citylist[random.nextInt(citylist.length)];
        String country=countrylist[random.nextInt(citylist.length)];

        return new Address(street,flatNo,houseNo,postalCode,city,country);
    }

    public List<Person>generatePeopleList(int n){
        List<Person> personList=new ArrayList<>();
        for (int i =0;i<n;i++){
            personList.add(generatePerson());
        }
        return personList;
    }
}
