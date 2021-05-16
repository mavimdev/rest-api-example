**List all Cars**
----
Returns json data with all cars.

* **URL**

  /cars

* **Method:**

  `GET`

*  **URL Params**
   
   None

* **Data Params**

  None

* **Success Response:**

    * **Code:** 200 OK<br />
      **Content:** `[
      {
      "id": 1,
      "brand": "Ford",
      "model": "Focus",
      "color": "Black",
      "owner": "John"
      }
      ]`

* **Error Response:**

    None

---

**Show a Car**
----
Returns json data with a car.

* **URL**

  /cars/:id

* **Method:**

  `GET`

*  **URL Params**

   **Required:**

   `id=[integer]`

* **Data Params**

  None

* **Success Response:**

    * **Code:** 200 OK<br />
      **Content:** `
      {
      "id": 1,
      "brand": "Ford",
      "model": "Focus",
      "color": "Black",
      "owner": "John"
      }`

* **Error Response:**

    * **Code:** 404 NOT FOUND <br />
      **Content:** `{ error : "Not Found" }`

---

**Create a new Car**
----
Creates a new Car.

* **URL**

  /cars

* **Method:**

  `POST`

*  **URL Params**

   None

* **Data Params**

  **Required:** ``
   {
    "brand": "Open",
    "model": "Astra",
    "color": "White",
    "owner": "Mary"
}  ``

* **Success Response:**

    * **Code:** 201 CREATED<br />
      **Content:** `{
      "id": 2,
      "brand": "Open",
      "model": "Astra",
      "color": "White",
      "owner": "Mary"
      }`

* **Error Response:**

  None

---

**Update an existing Car**
----
Updates the data from an existing car.

* **URL**

  /cars/:id

* **Method:**

  `PUT`

*  **URL Params**

   **Required:**

   `id=[integer]`

* **Data Params**

  **Required:** ``
  {
  "brand": "Open",
  "model": "Astra",
  "color": "Red",
  "owner": "Susanna"
  }  ``

* **Success Response:**

    * **Code:** 200 OK <br />
      **Content:** `{
      "id": 2,
      "brand": "Open",
      "model": "Astra",
      "color": "Red",
      "owner": "Susanna"
      }`

* **Error Response:**

    * **Code:** 404 NOT FOUND <br />
      **Content:** `{ error : "Not Found" }`

---

**Delete a Car**
----
Deletes an existing car.

* **URL**

  /cars/:id

* **Method:**

  `DELETE`

*  **URL Params**

   **Required:**

   `id=[integer]`

* **Data Params**

  None

* **Success Response:**

    * **Code:** 200 OK<br />
      **Content:** `
      {
      "id": 1,
      "brand": "Ford",
      "model": "Focus",
      "color": "Black",
      "owner": "John"
      }`

* **Error Response:**

    * **Code:** 404 NOT FOUND <br />
      **Content:** `{ error : "Not Found" }`
      
