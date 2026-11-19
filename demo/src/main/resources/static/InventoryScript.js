document.addEventListener("DOMContentLoaded", () => {

    const form = document.getElementById("inventoryForm");

    form.addEventListener("submit", async (e) => {
        e.preventDefault();

        const item = {
            productName: document.getElementById("productName").value,
            quantity: parseInt(document.getElementById("quantity").value),
            price: parseFloat(document.getElementById("price").value)
        };

        try {

            const response = await fetch("/api/inventory", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(item)
            });

            if(response.ok){
                alert("Product Added Successfully");
                form.reset();
                loadProducts();
            }

        } catch(error){
            console.error(error);
        }
    });

    loadProducts();
});

async function loadProducts() {

    const response = await fetch("/api/inventory");
    const products = await response.json();

    const tableBody = document.getElementById("inventoryBody");

    if(!tableBody) return;

    tableBody.innerHTML = "";

    products.forEach(product => {

        tableBody.innerHTML += `
            <tr>
                <td>${product.id}</td>
                <td>${product.productName}</td>
                <td>${product.quantity}</td>
                <td>R${product.price}</td>
            </tr>
        `;

    });
}