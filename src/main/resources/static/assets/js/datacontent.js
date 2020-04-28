
//    <script src="assets/js/datacontent.js"></script>

var table = document.getElementById("tableMarket");
var imageTruck = document.getElementById("truckImage");
var truckDescription = document.getElementById("truckDescription");
var buttonBuy = document.getElementById("buyButton");

var boughtTruck;


    function sendBoughtTruck() {


        var obj = JSON.parse('{ "name":"John", "age":30, "city":"New York"}');


        fetch("api/user/boughtTruck", {
            method: "post",
            body: obj
        })
            .then(res => res.json())
            .then(res => {
                console.log("Dodałem ciezarowke:");
                console.log(res);
            })

    }





    function buyTruckFunction(x) {

        $('#buyModal').modal('show');

        if(x.rowIndex===1){
            buttonBuy.onclick = function(){sendBoughtTruck(); $('#buyModal').modal('hide');}
            boughtTruck = "Tilt";

        }

        if(x.rowIndex===2){
            buttonBuy.onclick = function (){sendBoughtTruck(); $('#buyModal').modal('hide');}
            boughtTruck = "Standard";


            }
        } // // this function informs about bought truck (post type to java-backend)



    function setContentWithRow(x) {


        if(x.rowIndex===1) {
            imageTruck.src = "/assets/img/tilt.png";
            truckDescription.innerText="To bedzie opis ciezarowki Plandeka";
        }
        else if(x.rowIndex===2){
            imageTruck.src = "/assets/img/standard.png";
            truckDescription.innerText="To bedzie opis ciezarowki Standard";
        }
        else if(x.rowIndex===3){
            imageTruck.src = "/assets/img/set.png";
            truckDescription.innerText="To bedzie opis ciezarowki Zestaw";
        }
        else if(x.rowIndex===4){
            imageTruck.src = "/assets/img/tunk.png";
            truckDescription.innerText="To bedzie opis ciezarowki Cysterna";
        }
        else if(x.rowIndex===5){
            imageTruck.src = "/assets/img/tipcart.png";
            truckDescription.innerText="To bedzie opis ciezarowki Wywrotka";
        }

    } // this function sets Image and Description when mouse entered in truck row



    // fetch below get Content from api (TrucksMarketList) - available trucks in market

    fetch('/api/trucks/TrucksMarketApi/all')
        .then((response) => {
            return response.json();
        })
        .then((data) => {

            for (let i=0;i<data.length;i++)
            {
                var row = document.createElement("tr");
                row.onmouseenter = function(){setContentWithRow(this)};

                row.onclick = function(){buyTruckFunction(this)};


                row.classList.add("rowTable");


                var name_cell = document.createElement("td");
                var loadtype_cell = document.createElement("td");
                var length_cell = document.createElement("td");
                var width_cell = document.createElement("td");
                var height_cell = document.createElement("td");
                var weight_cell = document.createElement("td");
                var capacity_cell = document.createElement("td");
                var price_cell = document.createElement("td");


                var name_cell_text = document.createTextNode(data[i].name);
                var loadtype_cell_text = document.createTextNode(data[i].loading);
                var length_cell_text = document.createTextNode(data[i].length);
                var width_cell_text = document.createTextNode(data[i].width);
                var height_cell_text = document.createTextNode(data[i].height);
                var weight_cell_text = document.createTextNode(data[i].weight);
                var capacity_cell_text = document.createTextNode(data[i].capacity);
                var price_cell_text = document.createTextNode(data[i].price);


                name_cell.appendChild(name_cell_text);
                loadtype_cell.appendChild(loadtype_cell_text);
                length_cell.appendChild(length_cell_text);
                width_cell.appendChild(width_cell_text);
                height_cell.appendChild(height_cell_text);
                weight_cell.appendChild(weight_cell_text);
                capacity_cell.appendChild(capacity_cell_text);
                price_cell.appendChild(price_cell_text);


                row.appendChild(name_cell);
                row.appendChild(loadtype_cell);
                row.appendChild(length_cell);
                row.appendChild(width_cell);
                row.appendChild(height_cell);
                row.appendChild(weight_cell);
                row.appendChild(capacity_cell);
                row.appendChild(price_cell);



                table.appendChild(row);


        }});


