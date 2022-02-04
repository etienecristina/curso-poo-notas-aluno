package entidades;

public class Aluno {
    private String nome;
    private double notaTrimestre1;
    private double notaTrimestre2;
    private double notaTrimestre3;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaTrimestre1() {
        return notaTrimestre1;
    }

    public void setNotaTrimestre1(double notaTrimestre1) {
        this.notaTrimestre1 = notaTrimestre1;
    }

    public double getNotaTrimestre2() {
        return notaTrimestre2;
    }

    public void setNotaTrimestre2(double notaTrimestre2) {
        this.notaTrimestre2 = notaTrimestre2;
    }

    public double getNotaTrimestre3() {
        return notaTrimestre3;
    }

    public void setNotaTrimestre3(double notaTrimestre3) {
        this.notaTrimestre3 = notaTrimestre3;
    }

    public double notaFinal() {
        return notaTrimestre1 + notaTrimestre2 + notaTrimestre3;
    }

    public double pontosFaltantes() {
        if (notaFinal() < 60) {
            return 60 - notaFinal();
        } else {
            return 0.0;
        }
    }
}
