package Solution;

import Task.LinkedSequence;

public class Runner1 {
    public static void main(String[] args) {
        System.out.println("now with different prefix:");
        //a lil bit of chinese code
        {
            System.out.print(floyd(new LinkedSequence("LONGPREFIXAsomethingA")));
            System.out.print(floyd(new LinkedSequence("LONGPREFIAsomethingA")));
            System.out.print(floyd(new LinkedSequence("LONGPREFAsomethingA")));
            System.out.print(floyd(new LinkedSequence("LONGPREAsomethingA")));
            System.out.print(floyd(new LinkedSequence("LONGPRAsomethingA")));
            System.out.print(floyd(new LinkedSequence("LONGPAsomethingA")));
            System.out.print(floyd(new LinkedSequence("LONGAsomethingA")));
            System.out.print(floyd(new LinkedSequence("LONAsomethingA")));
            System.out.print(floyd(new LinkedSequence("LOAsomethingA")));
            System.out.print(floyd(new LinkedSequence("LAsomethingA")));
            System.out.print(floyd(new LinkedSequence("AsomethingA")));
        }
        System.out.println("\nnow with different cycle length:");
        //a lil bit of chinese code
        {
            System.out.print(floyd(new LinkedSequence("LONGPREFIXAsomethingA")));
            System.out.print(floyd(new LinkedSequence("LONGPREFIXAsomethinA")));
            System.out.print(floyd(new LinkedSequence("LONGPREFIXAsomethiA")));
            System.out.print(floyd(new LinkedSequence("LONGPREFIXAsomethA")));
            System.out.print(floyd(new LinkedSequence("LONGPREFIXAsometA")));
            System.out.print(floyd(new LinkedSequence("LONGPREFIXAsomeA")));
            System.out.print(floyd(new LinkedSequence("LONGPREFIXAsomA")));
            System.out.print(floyd(new LinkedSequence("LONGPREFIXAsoA")));
            System.out.print(floyd(new LinkedSequence("LONGPREFIXAsA")));
            System.out.print(floyd(new LinkedSequence("LONGPREFIXAA")));
        }
        System.out.println();
    }
    public static char floyd(LinkedSequence linkedSequence){
        LinkedSequence.Iterator tortoise = linkedSequence.getIterator(),
                hare = linkedSequence.getIterator();
        do{
            hare.iterate(2);
            tortoise.iterate(1);
        }while(!(hare.compare(tortoise) || hare.empty() || tortoise.empty()));

        if(hare.compare(tortoise)){
            tortoise = linkedSequence.getIterator();
            while (!hare.compare(tortoise))
            {
                hare.iterate(1);
                tortoise.iterate(1);
            }
            return hare.get();
        }else{
            return '\0';
        }
    }
}
