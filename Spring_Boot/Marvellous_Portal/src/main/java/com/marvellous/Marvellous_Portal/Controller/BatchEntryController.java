package com.marvellous.Marvellous_Portal.Controller;

import com.marvellous.Marvellous_Portal.Entity.BatchEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/batches")
public class BatchEntryController
{
    private HashMap <Long, BatchEntry> batchentries = new HashMap <Long, BatchEntry> ();

    @GetMapping
    public ArrayList<BatchEntry>getAll()
    {
        return new ArrayList<>(batchentries.values());
    }

    @PostMapping
    public String createEntry(@RequestBody BatchEntry myentry)      // Post entry will save in myentry variable
    {
        batchentries.put(myentry.getId(), myentry);
        return "Batch information gets successfully inserted";
    }

    // http:localhost:8080/batches/id/3
    @DeleteMapping("/id/{myid}")
    public void deleteById(@PathVariable Long myid)
    {
        batchentries.remove(myid);
    }

    @PutMapping("/id/{myid}")
    public void updateEntry(@PathVariable Long myid, @RequestBody BatchEntry myentry)
    {
        myentry.setId(myid);
        batchentries.put(myid,myentry);
    }

}
