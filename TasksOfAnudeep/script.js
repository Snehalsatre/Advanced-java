const container = document.querySelector('.container');
const count = document.getElementById('count');
const total = document.getElementById('total');
const movieSelect = document.getElementById('movie');

let ticketPrice = +movieSelect.value;

function updateSelectedCount() {
    const selectedSeats = document.querySelectorAll('.row .seat.selected');
    count.innerText = selectedSeats.length;
    total.innerText = selectedSeats.length * ticketPrice;
}

container.addEventListener('click', e => {
    if (e.target.classList.contains('seat') && !e.target.classList.contains('occupied')) {
        e.target.classList.toggle('selected');
        updateSelectedCount();
    }
});


updateSelectedCount();