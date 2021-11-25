/*package Inheritance;

 class overridding2 {

        void volumecontrol() {
            System.out.println("Volume is loud");
        }

        void menusetting() {
            System.out.println("Menu system is acceptable");
        }
    }
    class overridding_Sumsung extends overridding2{

        void volumecontrol(){
            System.out.println("Volume is myway ");
        }
        void menusetting(){
            System.out.println("Menu system is not acceptable");
        }
    }

    class overridding_onida extends overridding2
    {
        void volumecontrol() {
            System.out.println("Volume is mine ");
        }

        void menusetting() {
            System.out.println("Menu system is under taken ");
        }

    }
class Test1 {


            public static void main(String[] args) {

                overridding2 store = (overridding2) overridding_Samsung(); //This type called has upcasting or over ridding

                store.volumecontrol();
                store.menusetting();


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




