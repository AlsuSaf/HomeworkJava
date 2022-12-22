package ru.mirea.Lab6.task10;


public class Computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private ComputerBrands brand;

    public Computer(Processor processor, Memory memory, Monitor monitor, ComputerBrands brand) {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.brand = brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public ComputerBrands getBrand() {
        return brand;
    }

    public void setBrand(ComputerBrands brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Компьютер{" + "Процессор: " + processor + ", Память устроиства: " + memory + ", Монитор: " + monitor + ", Бренд: " + brand + '}';
    }
}