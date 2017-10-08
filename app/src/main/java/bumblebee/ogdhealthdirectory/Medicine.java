package bumblebee.ogdhealthdirectory;

/**
 * Created by anuragsharma on 07/10/17.
 */

public class Medicine {

    private String name, detailsHindi, detailsEnglish;

    public Medicine(String arr[]){
        name = arr[1];
        detailsEnglish = arr[2];
        detailsHindi = arr[3];

    }

    public String getName() {
        return name;
    }

    public String getDetailsHindi() {
        return detailsHindi;
    }

    public String getDetailsEnglish() {
        return detailsEnglish;
    }

}
