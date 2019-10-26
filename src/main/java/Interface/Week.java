package Interface;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class Week {
    private ObservableList<Text> monList;
    private ObservableList<Text> tueList;
    private ObservableList<Text> wedList;
    private ObservableList<Text> thuList;
    private ObservableList<Text> friList;
    private ObservableList<Text> satList;
    private ObservableList<Text> sunList;

    public Week() {
    }

    public Week(ObservableList<Text> monList, ObservableList<Text> tueList, ObservableList<Text> wedList,
                ObservableList<Text> thuList, ObservableList<Text> friList, ObservableList<Text> satList,
                ObservableList<Text> sunList) {
        this.monList = monList;
        this.tueList = tueList;
        this.wedList = wedList;
        this.thuList = thuList;
        this.friList = friList;
        this.satList = satList;
        this.sunList = sunList;
    }

    public ObservableList<Text> getMonList() {
        return monList;
    }

    public ObservableList<Text> getTueList() {
        return tueList;
    }

    public ObservableList<Text> getWedList() {
        return wedList;
    }

    public ObservableList<Text> getThuList() {
        return thuList;
    }

    public ObservableList<Text> getFriList() {
        return friList;
    }

    public ObservableList<Text> getSatList() {
        return satList;
    }

    public ObservableList<Text> getSunList() {
        return sunList;
    }
}
