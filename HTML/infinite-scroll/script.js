const imageContainer = document.getElementById('imageContainer');
const loader = document.getElementById('loader');

let ready = false;
let imagesLoaded = 0;
let totalImages = 0;
let photosArray = [];


// Unsplash API

const count = 30;
const apiKey = 'C7Q24krga5Jf0sZyAgWnQHB5IOE1mhaBX4Z5ZKsKr3c';
const apiUrl = `https://api.unsplash.com/photos/random/?client_id=${apiKey}&count=${count}`;

// Check if images are loaded

function imageLoaded() {
    imagesLoaded++;
    if (imagesLoaded === totalImages) {
        ready = true;
        loader.hidden = true;
    }
}

// Helper function to set attribute in DOM
function setAttributes(element, attributes) {
    for (const key in attributes) {
        element.setAttribute(key, attributes[key]);
    }
}

// Create elements for Links and Photos and Show them in DOM

function displayPhotos() {
    imagesLoaded = 0;
    totalImages = photosArray.length;
    // Run function for each element in photosArray
    photosArray.forEach((photo) => {
        // creating <a>
        const item = document.createElement('a');
        // item.setAttribute('href', photo.links.html);
        // item.setAttribute('target', '_blank');
        setAttributes(item, {
            href: photo.links.html,
            target: '_blank',
        });
        
        // creating <img>
        const img = document.createElement('img');
        // img.setAttribute('src', photo.urls.regular);
        // img.setAttribute('alt', photo.alt_description);
        // img.setAttribute('title', photo.alt_description);
        setAttributes(img, {
            src: photo.urls.regular,
            alt: photo.alt_description,
            title: photo.alt_description,
        });
        // Event listener to check if each image is loaded
        img.addEventListener('load', imageLoaded);

        // Put <img> inside <a> & <a> in imageContainer
        item.appendChild(img);
        imageContainer.appendChild(item);
    });
}


// Get Photos from Unsplash API

async function getPhotos() {
    try {
        const response = await fetch(apiUrl);
        photosArray = await response.json();
        displayPhotos();
        console.log(photosArray);
    }
    catch(error) {
        // Error Content Here
    }   
}

// Check to see if scrolling near bottom of the page, Load more photos

window.addEventListener('scroll', () => {
    if(window.innerHeight + window.scrollY >= document.body.offsetHeight - 1000 && ready) {
        ready = false;
        getPhotos();
    }
})

// On Page Load

getPhotos();