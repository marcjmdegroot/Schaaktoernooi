$(document).ready(loadSchakers());

function loadSchakers()
 {
 $.ajax(
    {
        type:"GET",
        url:"/api/schaker/all",
        success:function(data)
                {
                var htmlschakers = '<table><table class="table"><thead class="black white-text"><tr><th scope="col">#</th><th scope="col">Voornaam</th><th scope="col">Tussenvoegsel</th><th scope="col">Achternaam</th><th scope="col">Geboortedatum</th><th scope="col">gewonnen</th><th scope="col">remises</th><th scope="col">verloren</th></tr></thead>';
                $.each(data, function(index,value)
                 {
                    htmlschakers += '<tr>';

                    htmlschakers += '<td>' + value.schaakID + '</td>';

                    htmlschakers += '<td>' + value.voornaam + '</td>';
                    htmlschakers += '<td>' + value.tussenvoegsel + '</td>';
                    htmlschakers += '<td>' + value.achternaam + '</td>';

                    htmlschakers += '<td>' + value.geboortedatum + '</td>';

                    htmlschakers += '<td>' + value.gewonnenPartijen + '</td>';
                    htmlschakers += '<td>' + value.remises + '</td>';
                    htmlschakers += '<td>' + value.verlorenPartijen + '</td>';

                    htmlschakers += '</tr>';
                 })
                htmlschakers += '</table>';
                $('#alleschakers').html(htmlschakers);
                }
    }
    )
 }


