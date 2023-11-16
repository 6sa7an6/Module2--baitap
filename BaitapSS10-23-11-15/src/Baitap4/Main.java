package Baitap4;

import Baitap4.FootballTeam.FootballTeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FootballTeam team1 = new FootballTeam(1,"HN",9,10);
        FootballTeam team2 = new FootballTeam(2,"SG",10,7);
        FootballTeam team3 = new FootballTeam(3,"HP",15,9);
        FootballTeam team4 = new FootballTeam(4,"NT",8,15);
        FootballTeam team5 = new FootballTeam(5,"DN",11,11);
        List<FootballTeam> footballTeams = new ArrayList<>();
        footballTeams.add(team1);
        footballTeams.add(team2);
        footballTeams.add(team3);
        footballTeams.add(team4);
        footballTeams.add(team5);
        System.out.println("List chưa sắp xếp là : ");
        for (FootballTeam team:footballTeams
             ) {
            System.out.println(team);
        }
        System.out.println("List sắp xếp theo điểm số cao đến thấp là : ");
        bubbleSort(footballTeams,(o1, o2) -> o1.getScore()-o2.getScore());
        for (FootballTeam team:footballTeams
        ) {
            System.out.println(team);
        }
    }
    public static <T> void bubbleSort(List<T> arr , Comparator<T> comparator){
        boolean flag = true;
        for(int i = 1; i< arr.size() && flag ; i++){
            flag = false;
            for(int j = 0;j< arr.size() - i;j++){
                if(comparator.compare(arr.get(j),arr.get(j+1))>0){
                    T temp = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                    flag = true;
                }
            }
        }
    }
}
