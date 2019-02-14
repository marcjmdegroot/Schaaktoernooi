function addSchaker()
{
var schakerJSONString = JSON.stringify(formToJSON());
$.ajax({
    type: "POST",
    url: "/api/schaker/add",
    contentType: 'application/json',
    data: schakerJSONString,
    dataType:'json'
    });
    console.log(schakerJSONString);
    alert('');
}

function formToJSON()
{
    var jsonObject = {};

    if($("#voornaam").val())
    {
        jsonObject["voornaam"] = $("#voornaam").val();
    }
    if($("#tussenvoegsel").val())
    {
        jsonObject["tussenvoegsel"] = $("#tussenvoegsel").val();
    }
    if($("#achternaam").val())
    {
        jsonObject["achternaam"] = $("#achternaam").val();
    }
    if($("#geboortedatum").val())
    {
        jsonObject.geboortedatum = $("#geboortedatum").val();
    }

    jsonObject["gewonnenPartijen"] = 0;
    jsonObject["remises"] = 0;
    jsonObject["verlorenPartijen"] = 0;

    //console.log(jsonObject);
    return jsonObject;
}