package br.com.devfelipebemvindo.live_extra;

public class Main {

    public static void main(String[] args) {
        Button buttonSend = new Button();
        Button buttonCancel= new Button();
        View view = new View();

        buttonSend.setBackgroung(0x0000FF); // RGB
        buttonSend.setTextColor(0xFFFFFF);
        buttonSend.setText("Enviar");

        buttonCancel.setBackgroung(0xFF0000); // RGB
        buttonCancel.setTextColor(0xFFFFFF);
        buttonCancel.setText("Cancelar");

        view.setWidth(120);
        view.setHeight(120);
        view.setMainButton(buttonSend);
    }
}
