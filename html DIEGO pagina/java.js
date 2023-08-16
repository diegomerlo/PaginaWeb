const barra_i = document.getElementById('barra_i'); // Sin el símbolo #
const iconContainer = document.querySelector('.icon-container');

let rotation = 0;

iconContainer.addEventListener('click', () => {
    rotation += 45; // Cambia el ángulo de rotación según tus necesidades
    barra_i.style.transform = `rotate(${rotation}deg)`;
});
