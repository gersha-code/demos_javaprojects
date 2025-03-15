package ProgramacionOrientadaOBjetos.telefonosHerenciaEQUIPO;

import java.util.Random;
import java.util.Scanner;

public class iphone extends telefono {
    String contactos[];
    String apps[];

    public iphone(String titular) {
        super(titular);
        this.contactos = new String[20];
        this.apps = new String[5];
        this.apps[0] = "camara";
    }

    public void mostrarApps(){
        for (int i = 0; i < this.apps.length; i++) {
            if (this.apps[i] != null) {
                System.out.println(this.apps[i]);
            }
        }
    }

    public String[] Instalar(String app) {
        System.out.println("ENTRO AL METODO INTALAR");
        if (super.isBoton()) {
            for (int i = 0; i < apps.length; i++) {
                if (this.apps[i] == null && this.apps[i].equalsIgnoreCase(this.apps[i]) != app.equalsIgnoreCase(app)) {
                    this.apps[i].equalsIgnoreCase(app);
                    System.out.println("Se instalo " + app);
                    return this.apps;
                } else {
                    System.out.println("Error");
                }
            }
        } else {
            System.out.println("Telefono apagado");
        }
        return this.apps;
    }

    public String[] Desinstalar(String app) {
        if (super.isBoton()) {
            for (int i = 0; i < apps.length; i++) {
                if (this.apps[i].equalsIgnoreCase(this.apps[i]) == app.equalsIgnoreCase(app)) {
                    this.apps[i] = null;
                    System.out.println("Se desinstalo" + app);
                    return this.apps;
                } else {
                    System.out.println("Error");
                }
            }
        } else {
            System.out.println("Telefono apagado");
        }
        return this.apps;
    }

    public void Mostrar_contactos() {
        if (super.isBoton()) {
            for (int i = 0; i < this.contactos.length; i++) {
                if (this.contactos[i] != null) {
                    System.out.println(this.contactos[i]);
                }
            }
        } else {
            System.out.println("Telefono apagado");
        }
    }

    public String[] registrarContactos(String contacto) {
        for (int i = 0; i < this.contactos.length; i++) {
            if (this.contactos[i] == null) {
                this.contactos[i] = contacto;
                return this.contactos;
            } else {
                System.out.println("Agenda de contactos llena");
            }
        }
        return this.contactos;
    }

    public void Tomar_foto() {
        Random random = new Random();
        switch (random.nextInt(0, 5)) {
            case 1:
            System.out.println("
                                    /@
                     __        __   /\/
                    /==\      /  \ /\/   
                  /======\    \/\__ \__
                /==/\  /\==\    /\ |__ \
             /==/    ||    \=\ / / / / /
           /=/    /\ || /\   \=\/ /     
        /===/   /   \||/   \   \===\
      /===/   /_________________ \===\
   /====/   / |                /  \====\
 /====/   /   |  _________    /  \   \===\    THE LEGEND OF 
 /==/   /     | /   /  \ / / /  __________\_____      ______       ___
|===| /       |/   /____/ / /   \   _____ |\   /      \     \      \  \
 \==\             /\   / / /     | |  /= \| | |        | | \ \     /   \
 \===\__    \    /  \ / / /   /  | | /===/  | |        | |  \ \   / / \ \
   \==\ \    \\ /____/   / \ //  | |_____/| | |        | |   | | / /___\ \
   \===\ \   \\\\\\\/   /////// /|  _____ | | |        | |   | | |  ___  |
     \==\/     \\\\/ / //////   \| |/==/ \| | |        | |   | | | /   \ |
     \==\       \\/ / /////    _ | |==/     | |        | |  / /  | |   | |
       \==\  / \ / / ///      /|\| |_____/| | |_____/| | |_/ /   | |   | |
       \==\ /   / / /________/ |/_________|/_________|/_____/   /___\ /___\
         \==\  /               | /==/
         \=\  /________________|/=/    OCARINA OF TIME
           \==\     _____     /==/ 
          / \===\   \   /   /===/
         / / /\===\  \ /  /===/
        / / /   \====\ /====/
       / / /      \===|===/
       |/ /         \===/
                      =");
     
                break;
            case 2:System.out.println("
                                
                       #######
            ######    ########       #####
        ###########/#####\#####  #############
    ############/##########--#####################
  ####         ######################          #####
 ##          ####      ##########/@@              ###
#          ####        ,-.##/`.#\#####               ##
          ###         /  |$/  |,-. ####                 #
         ##           \,'$\_,'|  \  ###
         #              \_$$$$$`./   ##
                          $$$$$_/     ##
                          $$$$$        #
                          $$$$$
                          $$$$$
                          $$$$$
                          $$$$$
                         $$$$$
                         $$$$$
                         $$$$$
                         $$$$$        ___
                         $$$$$    .-'      `- .
                        $$$$$   ,'             `.
                        $$$$$  /                 \
~~~~~~~~~~~~~~~~~~~~~~~$$$$$~~~'~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   ~      ~  ~    ~  ~ $$$$$  ~   ~       ~          ~
       ~ ~      .o,    $$$$$     ~    ~  ~        ~
  ~            ~ ^   ~ $$$$$~        ______    ~        ~
_______________________$$$$$________|\\\\\\\_________________
                       $$$$$        |>\\\\\\\
    ______             $$$$$        |>>\\\\\\\
   \Q%=/\,\            $$$$$       /\>>|#####|
    `------`           $$$$$      /=|\>|#####|
                       $$$$$        ||\|#####|
                      $$$$$$$          ||    ||
                      |$$$$$$$          ||   ||
                     ||$$$$$$$$$
|||||||||||||||||||||$$$$$$$$$|||||||||||||||||||||||||||||||
                        |$$$    ||""" );
                break;
            case 3:System.out.println("                       * 
                                  * 
     *                                             * 
                                          * 
               * 
                             * 
                                                       * 
    * 
                                             * 
        * 
                      *             * 
                                                * 
 *                                                               * 
          * 
                          (             ) 
                  )      (*)           (*)      ( 
         *       (*)      |             |      (*) 
                  |      |~|           |~|      |          * 
                 |~|     | |           | |     |~| 
                 | |     | |           | |     | | 
                ,| |a@@@@| |@@@@@@@@@@@| |@@@@a| |. 
           .,a@@@| |@@@@@| |@@@@@@@@@@@| |@@@@@| |@@@@a,. 
         ,a@@@@@@| |@@@@@@@@@@@@.@@@@@@@@@@@@@@| |@@@@@@@a, 
        a@@@@@@@@@@@@@@@@@@@@@' . `@@@@@@@@@@@@@@@@@@@@@@@@a 
        ;`@@@@@@@@@@@@@@@@@@'   .   `@@@@@@@@@@@@@@@@@@@@@'; 
        ;@@@`@@@@@@@@@@@@@'     .     `@@@@@@@@@@@@@@@@'@@@; 
        ;@@@;,.aaaaaaaaaa       .       aaaaa,,aaaaaaa,;@@@; 
        ;;@;;;;@@@@@@@@;@      @.@      ;@@@;;;@@@@@@;;;;@@; 
        ;;;;;;;@@@@;@@;;@    @@ . @@    ;;@;;;;@@;@@@;;;;;;; 
        ;;;;;;;;@@;;;;;;;  @@   .   @@  ;;;;;;;;;;;@@;;;;@;; 
        ;;;;;;;;;;;;;;;;;@@     .     @@;;;;;;;;;;;;;;;;@@a; 
    ,%%%;;;;;;;;@;;;;;;;;       .       ;;;;;;;;;;;;;;;;@@;;%%%, 
 .%%%%%%;;;;;;;a@;;;;;;;;     ,%%%,     ;;;;;;;;;;;;;;;;;;;;%%%%%%, 
.%%%%%%%;;;;;;;@@;;;;;;;;   ,%%%%%%%,   ;;;;;;;;;;;;;;;;;;;;%%%%%%%, 
%%%%%%%%`;;;;;;;;;;;;;;;;  %%%%%%%%%%%  ;;;;;;;;;;;;;;;;;;;'%%%%%%%% 
%%%%%%%%%%%%`;;;;;;;;;;;;,%%%%%%%%%%%%%,;;;;;;;;;;;;;;;'%%%%%%%%%%%% 
`%%%%%%%%%%%%%%%%%,,,,,,,%%%%%%%%%%%%%%%,,,,,,,%%%%%%%%%%%%%%%%%%%%' 
  `%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%' 
      `%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%' 
             """"""""""""""`,,,,,,,,,'""""""""""""""""" 
                            `%%%%%%%' 
                             `%%%%%' 
                               %%% 
                              %%%%% 
                           .,%%%%%%%,. 
                      ,%%%%%%%%%%%%%%%%%%%, 
          ---------------------------------------------""");
                break;
            case 4:System.out.println("                        ..,,,,,,,,,.. 
                     .,;%%%%%%%%%%%%%%%%%%%%;,. 
                   %%%%%%%%%%%%%%%%%%%%////%%%%%%, .,;%%;, 
            .,;%/,%%%%%/////%%%%%%%%%%%%%%////%%%%,%%//%%%, 
        .,;%%%%/,%%%///%%%%%%%%%%%%%%%%%%%%%%%%%%%%,////%%%%;, 
     .,%%%%%%//,%%%%%%%%%%%%%%%%@@%a%%%%%%%%%%%%%%%%,%%/%%%%%%%;, 
   .,%//%%%%//,%%%%///////%%%%%%%@@@%%%%%%///////%%%%,%%//%%%%%%%%, 
 ,%%%%%///%%//,%%//%%%%%///%%%%%@@@%%%%%////%%%%%%%%%,/%%%%%%%%%%%%% 
.%%%%%%%%%////,%%%%%%%//%///%%%%@@@@%%%////%%/////%%%,/;%%%%%%%%/%%% 
%/%%%%%%%/////,%%%%///%%////%%%@@@@@%%%///%%/%%%%%//%,////%%%%//%%%' 
%//%%%%%//////,%/%a`  'a%///%%%@@@@@@%%////a`  'a%%%%,//%///%/%%%%% 
%///%%%%%%///,%%%%@@aa@@%//%%%@@@@S@@@%%///@@aa@@%%%%%,/%////%%%%% 
%%//%%%%%%%//,%%%%%///////%%%@S@@@@SS@@@%%/////%%%%%%%,%////%%%%%' 
%%//%%%%%%%//,%%%%/////%%@%@SS@@@@@@@S@@@@%%%%/////%%%,////%%%%%' 
`%/%%%%//%%//,%%%///%%%%@@@S@@@@@@@@@@@@@@@S%%%%////%%,///%%%%%' 
  %%%%//%%%%/,%%%%%%%%@@@@@@@@@@@@@@@@@@@@@SS@%%%%%%%%,//%%%%%' 
  `%%%//%%%%/,%%%%@%@@@@@@@@@@@@@@@@@@@@@@@@@S@@%%%%%,/////%%' 
   `%%%//%%%/,%%%@@@SS@@SSs@@@@@@@@@@@@@sSS@@@@@@%%%,//%%//%' 
    `%%%%%%/  %%S@@SS@@@@@Ss` .,,.    'sS@@@S@@@@%'  ///%/%' 
      `%%%/    %SS@@@@SSS@@S.         .S@@SSS@@@@'    //%%' 
               /`S@@@@@@SSSSSs,     ,sSSSSS@@@@@' 
             %%//`@@@@@@@@@@@@@Ss,sS@@@@@@@@@@@'/ 
           %%%%@@00`@@@@@@@@@@@@@'@@@@@@@@@@@'//%% 
       %%%%%%a%@@@@000aaaaaaaaa00a00aaaaaaa00%@%%%%% 
    %%%%%%a%%@@@@@@@@@@000000000000000000@@@%@@%%%@%%% 
 %%%%%%a%%@@@%@@@@@@@@@@@00000000000000@@@@@@@@@%@@%%@%% 
%%%aa%@@@@@@@@@@@@@@0000000000000000000000@@@@@@@@%@@@%%%% 
%%@@@@@@@@@@@@@@@00000000000000000000000000000@@@@@@@@@%%%%%");
                break;
            case 5:System.out.println("   """"             ,     ,  ._  ,
                .MMmm.mMm_Mm.MMm_:mMMmmm..  .
            .-mmMMMMMMMMMMMMm:MMm:MMMMMMMMMm.
            `-.mm.MMMMMMM:MMMMMMMmmMMMMMMMMMmm.
         .mMMMMMmMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM"~.
          .MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm.
         .MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm.
      ..mMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMmmm.
     .mmMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm.
      .MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm_
  .mmMMMMMMMMMMMMMMMMMMMMMMMM' `MMMMMMMMMMMMMMMMMMMMMMm,
 .-' .mMMMMMMMMMMMMMMMMMMM'      `MMMMMMMMMMMMMMMM""`
  ,MMMmMMMMMMMMMMMMMMMM'            `MMMMMMMMMMMMMMmm.
    .-'MMMMMMMMMMMMMMM.'""`.    ,'""`.MMMMMMMMMMMMMMMM.
   .mmMMMMMMMMMMMMMMMM' <(o)>`  '<(o)>` MMMMMMMMMMMMMMMm.
      .MMMMMMMMMMMMMMM                 'MMMMMMMMMMMMMMM:
   ,MMMmMMMMMMMMMMMMM'                 `MMMMMMMMMMMMmm.
  ,ME:MMMMMMMMMMMMMM_6       -  -       7_MMMMMMMMM:Mm_
  !M:MmmMMMMMMMMMMMMML_                _JMMMMMMMMMm:MMm.
  '':mMMMMMMMMMMMMMMMM\     ______     /dMMMMMMMMMMM:'Mm.
   ':MMM:MMMMMMMMMMMMMM\    `.__.'    /MMMMMM:MMMMMMm: `
  .M:MMM:MMMMMMMMMMMMMMM`.          ,'MMMMMMM:MMMMMMMm
    .Mm:mMMMMMMMMMMMMMMM| `.      .' |MMMMMMm:.MMMMM.
   .Mm:mMMMMMMMMMMMMMMMM|   `----':: |MMMMMMMmm`MMMMMm.
     !:mMMMMMMMMMMMMMMMM|      ::::. |MMMMMMMMMMM``mMm.
       !MMMMMMMMM'MMMMMM|      .:::. |MMMMMMMMMMMMM..
       MMMMMMMMM'MMMM'M/       ::::'  \MMMMMMMMMMMMMMm,
      .mMMMMMMM'MMMM'MMm.       '     .`".MMMMMMMMMMMMm.
       !!JmMMM'MMM' `M:.      ,  ,     .. M.".MMMMMMMMm.
        FMMMMMm.`M   M..              .. `Mm   `"".MMMmm.
        MMMM'    M      ..           ..    `M      MM`.M!
        Mm'               ..        ..      M      M'   \
        /                                                \dp """);
                break;

            default:
                break;
        }
    }
}
