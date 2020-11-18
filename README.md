# RESTSimpleProject
This project is assigned by NJC LABS for knowledge assessment.

## Database
* The database is built using MySQL, which will be running locally at port 3306.
* Database Schema: sql_invoicing
* Table: clients

client_id | name | address | city | state | phone 
--- | --- | --- | --- |--- |--- 
1 | Vinte |3 Nevada Parkway | Syracuse | NY | 315-252-7305
2 | Myworks | 34267 Glendale Parkway | Huntington | WV | 304-659-1170
3 | Yadel | 096 Pawling Parkway | San Francisco| CA | 415-144-6037
4 | Kwideo| 81674 Westerfield Circle | Waco | TX | 254-750-0784
5 | Topiclounge | 0863 Farmco Road | Portland | OR | 971-888-9129

## SQL example by scripting in MySQL
* Retrieve all client information
<pre><code>SELECT * FROM sql_invoicing.clients;
</code></pre>

* Retrieve client information by id
<pre><code>SELECT * FROM sql_invoicing.clients WHERE client_id=1;
</code></pre>

* Retrieve client information by name
<pre><code>SELECT * FROM sql_invoicing.clients WHERE NAME="Yadel";
</code></pre>

## SQL example by using REST API
* Retrieve all client information
<pre><code>$ curl http://127.0.0.1:8080/clients
</code></pre>
* Output:
<pre><code> [{"client_id":1,"name":"Vinte","address":"3 Nevada Parkway","city":"Syracuse","state":"NY","phone":"315-252-7305"},{"client_id":2,"name":"Myworks","address":"34267 Glendale Parkway","city":"Huntington","state":"WV","phone":"304-659-1170"},{"client_id":3,"name":"Yadel","address":"096 Pawling Parkway","city":"San Francisco","state":"CA","phone":"415-144-6037"},{"client_id":4,"name":"Kwideo","address":"81674 Westerfield Circle","city":"Waco","state":"TX","phone":"254-750-0784"},{"client_id":5,"name":"Topiclounge","address":"0863 Farmco Road","city":"Portland","state":"OR","phone":"971-888-9129"}]
</code></pre>
* Retrieve client information by id
<pre><code>$ curl http://127.0.0.1:8080/clients/clientId=1
</code></pre>
* Output:
<pre><code> {"client_id":1,"name":"Vinte","address":"3 Nevada Parkway","city":"Syracuse","state":"NY","phone":"315-252-7305"}
</code></pre>
* Retrieve client information by name
<pre><code>
$ curl http://127.0.0.1:8080/clients/clientName=Yadel
</code></pre>
* Output:
<pre><code>
[{"client_id":3,"name":"Yadel","address":"096 Pawling Parkway","city":"San Francisco","state":"CA","phone":"415-144-6037"}]
</code></pre>


## Screenshot
![SQLExamples](https://github.com/zezhou-zhang/RESTSimpleProject/blob/main/SQLExample.png)  
*SQL through REST API*
