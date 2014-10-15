package es.upm.miw.pd.command.calculator.memento;

public interface Mementable<T> {
    T createMemento();

    void restoreMemento(T memento);

}
