package redischool.Lesson11;

public class Colors {
    enum Operation {
        INVERTCOLORS("Mixen"), ADDCOLORS("Addieren"), MIXCOLORS("Invertieren");
        private String translation;
        Operation(String translation) {
            this.translation = translation;
        }
        public String getTranslation() {
            return translation;
        }
    }
    public static void main(String[] args) {
        String color1 = "RED";
        String color2 = "BLUE";
        Operation operation = Operation.INVERTCOLORS;    //3 mix colors , 2 add colors, 1 invert colors
        String newColor = "";
        switch (operation) {
            case MIXCOLORS:
                newColor = color1 + color2;
                break;
            case ADDCOLORS:
                newColor = color1 + "ADD" + color2;
                break;
            case INVERTCOLORS:
                newColor = color1 + "INVERT" + color2;
                break;
        }
        System.out.println(operation.getTranslation());
        System.out.println(newColor);
    }
}
