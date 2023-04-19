package br.com.gpacheco;

public class Controller {
    public static void main(String[] args) {

        try {

            Model a = new Model("Thiago Damasceno", 3200.00, 8);
            Model b = new Model("Luiz Dias", 1700.00, 8);
            Model c = new Model("Marcos Luiz", 2700.00, 6);

            System.out.printf("O funcionario %s, recebeu um aumento de salario e agora seu novo salario equivale há R$%.2f," +
                    " e sua carga horaria equivale há %d horas", a.getNome(), a.porcentagemDeAumento(), a.getCargaHoraria());

            System.out.printf("O funcionario %s, recebeu um aumento de salario e agora seu novo salario equivale há R$%.2f," +
                    " e sua carga horaria equivale há %d horas", b.getNome(), b.porcentagemDeAumento(), b.getCargaHoraria());

            System.out.printf("O funcionario %s, recebeu um aumento de salario e agora seu novo salario equivale há R$%.2f," +
                    " e sua carga horaria equivale há %d horas", c.getNome(), c.porcentagemDeAumento(), c.getCargaHoraria());

        }

        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
