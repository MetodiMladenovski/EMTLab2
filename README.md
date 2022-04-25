# EMTLab2

In order to fully test the functionality of this excercise, you will need to add countries and authors via postman,
because the interface for the h2-database can't connect on heroku, and I am not sure that the ones I have added will remain in the database.

1) Add countries with POST method on the following URL -> https://emt-backend-181085.herokuapp.com/countries
and the following JSON body:
{
    "name": "Macedonia",
    "continent": "Europe"
} 
You can check if they are added using the GET method on the same URL

2) Add authors with POST method on the following URL -> https://emt-backend-181085.herokuapp.com/authors
and the following JSON body:
{
    "name": "Metodi",
    "surname": "Mladenovski",
    "country": 1
}
You can check if they are added using the GET method on the same URL
