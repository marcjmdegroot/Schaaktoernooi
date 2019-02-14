
function loadSchakers()
 {
 $.ajax(
    {
        type:"GET",
        url:"/api/dish/all",
        success:returnfunction(data)
    }
    )
 }


function returnfunction(data)
{
var htmlschakers = '<table><table class="table"><thead class="black white-text"><tr><th scope="col">#</th><th scope="col">Voornaam</th><th scope="col">Tussenvoegsel</th><th scope="col">Achternaam</th><th scope="col">Geboortedatum</th><th scope="col">gewonnen</th><th scope="col">remises</th><th scope="col">verloren</th></tr></thead>'
$.each(data, function(index,value)
 {

 }

}