function deleteSchaker(id)
{
$.ajax(
    {
        type:"GET",
        url:"/api/schaker/"+id,
        success:function(schaker)
                {

                    if(schaker.gespeeldePartijen > 0)
                    {
                        var r=confirm(schaker.voornaam + " " + schaker.tussenvoegsel + " " + schaker.achternaam + " heeft al aardig wat partijen gespeeld, " + schaker.gespeeldePartijen + " al zelfs! \n\n Wil je hem echt verwijderen?");
                        if (r==true)
                          {
                                $.ajax({
                                    type: "POST",
                                    url: "/api/schaker/delete",
                                    data: schaker.schaakID
                                    })
                          }
                        else
                          {
                                alert(schaker.voornaam + " " + schaker.tussenvoegsel + " " + schaker.achternaam + " is je dankbaar!");
                          }
                    } else {
                        console.log(schaker);
                        alert(schaker.schaakID);
                        $.ajax({
                                type: "POST",
                                url: "/api/schaker/delete",
                                data: schaker.schaakID
                                })
                        alert(schaker.voornaam + " " + schaker.tussenvoegsel + " " + schaker.achternaam + " is zeer bedroefd.");
                    }
                }
                        }
    )

}