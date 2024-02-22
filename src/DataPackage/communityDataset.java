/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataPackage;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author jalan
 */
public class communityDataset {
     private List<community> communities;

    public communityDataset() {
        communities = new ArrayList<>();
        // Add sample data
        communities.add(new community("Community A", "City X"));
        communities.add(new community("Community B", "City Y"));
        communities.add(new community("Community C", "City Z"));
        // Add more communities as needed
    }

    // Getter for the list of communities
    public List<community> getCommunities() {
        return communities;
    }
}
