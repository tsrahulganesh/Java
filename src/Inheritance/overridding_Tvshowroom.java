/*package Inheritance;

public class overridding_Tvshowroom {

    void volumecontrol() {
        System.out.println("Volume is loud");
    }

    void menusetting() {
        System.out.println("Menu system is acceptable");
    }
}
    class overridding_Sumsung extends overridding_Tvshowroom{

        void volumecontrol1(){
            System.out.println("Volume is myway ");
        }
        void menusetting1(){
            System.out.println("Menu system is not acceptable");
        }
    }

    class overridding_onida extends overridding_Tvshowroom {
        void volumecontrol2() {
            System.out.println("Volume is mine ");
        }

        void menusetting2() {
            System.out.println("Menu system is under taken ");
        }


        public static void main(String[] args) {

            overridding_Tvshowroom Television = new overridding_Tvshowroom();
            Television.volumecontrol();
            Television.menusetting();

            overridding_Sumsung Television1 = new overridding_Sumsung();
            Television1.volumecontrol1();
            Television1.menusetting1();

            overridding_onida Television2 = new overridding_onida();
            Television2.volumecontrol2();
            Television2.menusetting2();

        }
    }
/*Result
        Volume is loud
        Menu system is acceptable
        Volume is myway
        Menu system is not acceptable
        Volume is mine
        Menu system is under taken

Now if we see, over ridding is of both parent and child having same methods and it can be interchanged or stored into one another
please find the same programe in overridding eg.*/


