
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno.informatica
 */
public class IterablePlayground {

    public static void main(String[] args){
                        System.out.println("Este es el for");

        List<Integer> list = Arrays.asList(10,20,30,40,50);
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
                System.out.println("Este es el otro for");
        
        for (Integer elem : list){
            System.out.println(elem);
        }
    }
}
