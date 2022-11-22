package task_1;

public class Notebook {
    private final String model;
    private final float diagonal;
    private final String processor;
    private int ram;
    private int hardDiskSpace;
    private String os;
    private final String color;

    public Notebook(String model, float diagonal, String processor,
                    int ram, int hardDiskSpace, String os, String color) {
        this.model = model;
        this.processor = processor;
        this.diagonal = diagonal;
        this.ram = ram;
        this.hardDiskSpace = hardDiskSpace;
        this.os = os;
        this.color = color;
    }

    public String getProcessor() {
        return processor;
    }

    public String getModel() {
        return model;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHardDiskSpace() {
        return hardDiskSpace;
    }

    public void setHardDiskSpace(int hardDiskSpace) {
        this.hardDiskSpace = hardDiskSpace;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("Модель: %s " +
                        "Процессор: %s " +
                        "Диагональ: %.1f " +
                        "ОЗУ: %d " +
                        "Жесткий диск: %d " +
                        "ОС: %s " +
                        "Цвет: %s",
                model, processor, diagonal,
                ram, hardDiskSpace, os, color);
    }
}
