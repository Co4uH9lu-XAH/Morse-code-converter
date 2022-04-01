public class EncoderMethod {

    // Такую кривоту я написал, когда был молодой и глупый.
    // Теперь я постарел и поумнел, и понимаю, что лучше делать алфавит в хэшМапе и получать доступ по ключу

    final static String A = "та-пиии ";
    final static String BE = "пиии-та-та-та ";
    final static String VE = "та-пиии-пиии ";
    final static String GE = "пиии-пиии-та ";
    final static String DE = "пиии-та-та ";
    final static String E = "та";
    final static String ZHE = "та-та-та-пиии ";
    final static String ZE = "пиии-пиии-та-та ";
    final static String I = "та-та ";
    final static String IKR = "та-пиии-пиии-пиии ";
    final static String KA = "пиии-та-пиии ";
    final static String EL = "та-пиии-та-та ";
    final static String EM = "пиии-пиии ";
    final static String EN = "пиии-та ";
    final static String O = "пиии-пиии-пиии ";
    final static String PE = "та-пиии-пиии-та ";
    final static String RE = "та-пиии-та ";
    final static String SE = "та-та-та ";
    final static String TE = "пиии ";
    final static String U = "та-та-пиии ";
    final static String EF = "та-та-пиии-та ";
    final static String HA = "та-та-та-та ";
    final static String CE = "пиии-та-пиии-та ";
    final static String CHE = "пиии-пиии-пиии-та ";
    final static String SHA = "пиии-пиии-пиии-пиии ";
    final static String CHA = "пиии-пиии-та-пиии ";
    final static String SOFT = "пиии-та-та-пиии ";
    final static String Y = "пиии-та-пиии-пиии ";
    final static String EEE = "та-та-пиии-та-та ";
    final static String YU = "та-та-пиии-пиии ";
    final static String YA = "та-пиии-та-пиии ";

    final static String ONE = "та-пиии-пиии-пиии-пиии ";
    final static String TWO = "та-та-пиии-пиии-пиии ";
    final static String THREE = "та-та-та-пиии-пиии ";
    final static String FOUR = "та-та-та-та-пиии ";
    final static String FIVE = "та-та-та-та-та ";
    final static String SIX = "пиии-та-та-та-та ";
    final static String SEVEN = "пиии-пиии-та-та-та ";
    final static String EIGHT = "пиии-пиии-пиии-та-та ";
    final static String NINE = "пиии-пиии-пиии-пиии-та ";
    final static String ZERO = "пиии-пиии-пиии-пиии-пиии ";

    final static String DOT = "та-та-та-та-та-та ";
    final static String COMMA = "та-пиии-та-пиии-та-пиии ";
    //final static String SPACE = " ";
    final static String SEMICOLON = "пиии-та-пиии-та-пиии-та ";
    final static String COLON = "пиии-пиии-пиии-та-та-та ";
    final static String QUESTION = "та-та-пиии-пиии-та-та ";
    final static String EXCLAMATION = "пиии-пиии-та-та-пиии-пиии ";
    final static String DASH = "пиии-та-та-та-та-пиии ";
    final static String QUOTATION = "та-пиии-та-та-пиии-та ";
    final static String PARENTHESIS = "пиии-та-пиии-пиии-та-пиии ";
    final static String SLASH = "пиии-та-та-пиии-та ";

    static String string;
    public static StringBuilder morseConvert(String str){
        StringBuilder strbld = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            char a = str.charAt(i);
            string = Character.toString(a);
            if(string.equalsIgnoreCase("а")){
                strbld.append(A);
            }else if (string.equalsIgnoreCase("б")){
                strbld.append(BE);
            }else if (string.equalsIgnoreCase("в")){
                strbld.append(VE);
            }else if (string.equalsIgnoreCase("г")){
                strbld.append(GE);
            }else if (string.equalsIgnoreCase("д")){
                strbld.append(DE);
            }else if (string.equalsIgnoreCase("е")){
                strbld.append(E);
            }else if (string.equalsIgnoreCase("ж")){
                strbld.append(ZHE);
            }else if (string.equalsIgnoreCase("з")){
                strbld.append(ZE);
            }else if (string.equalsIgnoreCase("и")){
                strbld.append(I);
            }else if (string.equalsIgnoreCase("й")){
                strbld.append(IKR);
            }else if (string.equalsIgnoreCase("к")){
                strbld.append(KA);
            }else if (string.equalsIgnoreCase("л")){
                strbld.append(EL);
            }else if (string.equalsIgnoreCase("м")){
                strbld.append(EM);
            }else if (string.equalsIgnoreCase("н")){
                strbld.append(EN);
            }else if (string.equalsIgnoreCase("о")){
                strbld.append(O);
            }else if (string.equalsIgnoreCase("п")){
                strbld.append(PE);
            }else if (string.equalsIgnoreCase("р")){
                strbld.append(RE);
            }else if (string.equalsIgnoreCase("с")){
                strbld.append(SE);
            }else if (string.equalsIgnoreCase("т")){
                strbld.append(TE);
            }else if (string.equalsIgnoreCase("у")){
                strbld.append(U);
            }else if (string.equalsIgnoreCase("ф")){
                strbld.append(EF);
            }else if (string.equalsIgnoreCase("т")){
                strbld.append(TE);
            }else if (string.equalsIgnoreCase("х")){
                strbld.append(HA);
            }else if (string.equalsIgnoreCase("ц")){
                strbld.append(CE);
            }else if (string.equalsIgnoreCase("ч")){
                strbld.append(CHE);
            }else if (string.equalsIgnoreCase("ш")){
                strbld.append(SHA);
            }else if (string.equalsIgnoreCase("щ")){
                strbld.append(CHA);
            }else if (string.equalsIgnoreCase("ь")){
                strbld.append(SOFT);
            }else if (string.equalsIgnoreCase("ъ")){
                strbld.append(SOFT);
            }else if (string.equalsIgnoreCase("ы")){
                strbld.append(Y);
            }else if (string.equalsIgnoreCase("э")){
                strbld.append(EEE);
            }else if (string.equalsIgnoreCase("ю")){
                strbld.append(YU);
            }else if (string.equalsIgnoreCase("я")){
                strbld.append(YA);
            }else if (string.equalsIgnoreCase("1")){
                strbld.append(ONE);
            }else if (string.equalsIgnoreCase("2")){
                strbld.append(TWO);
            }else if (string.equalsIgnoreCase("3")){
                strbld.append(THREE);
            }else if (string.equalsIgnoreCase("4")){
                strbld.append(FOUR);
            }else if (string.equalsIgnoreCase("5")){
                strbld.append(FIVE);
            }else if (string.equalsIgnoreCase("6")){
                strbld.append(SIX);
            }else if (string.equalsIgnoreCase("7")){
                strbld.append(SEVEN);
            }else if (string.equalsIgnoreCase("8")){
                strbld.append(EIGHT);
            }else if (string.equalsIgnoreCase("9")){
                strbld.append(NINE);
            }else if (string.equalsIgnoreCase("0")){
                strbld.append(ZERO);
            }else if (string.equalsIgnoreCase(".")){
                strbld.append(DOT);
            }else if (string.equalsIgnoreCase(",")){
                strbld.append(COMMA);
           // }else if (string.equalsIgnoreCase(" ")){
                //strbld.append(SPACE);
            }else if (string.equalsIgnoreCase(";")){
                strbld.append(SEMICOLON);
            }else if (string.equalsIgnoreCase(":")){
                strbld.append(COLON);
            }else if (string.equalsIgnoreCase("?")){
                strbld.append(QUESTION);
            }else if (string.equalsIgnoreCase("!")){
                strbld.append(EXCLAMATION);
            }else if (string.equalsIgnoreCase("-")){
                strbld.append(DASH);
            }else if (string.equalsIgnoreCase("\"")){
                strbld.append(QUOTATION);
            }else if (string.equalsIgnoreCase("(")){
                strbld.append(PARENTHESIS);
            }else if (string.equalsIgnoreCase("/")){
                strbld.append(SLASH);
            }
        }
        return strbld;
    }
}
