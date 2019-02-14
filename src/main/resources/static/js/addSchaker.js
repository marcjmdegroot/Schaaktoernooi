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

    //console.log(jsonObject);
    return jsonObject;
}