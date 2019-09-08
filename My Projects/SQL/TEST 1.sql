SELECT v.vendor_name AS Vendor, CONCAT(v.vendor_contact_first_name," ",v.vendor_contact_last_name) AS Contact,
i.invoice_date AS InvDate, 
DAY(i.invoice_date) AS Dayof,

substring(i.invoice_number, 3, 2) AS ThirdFourth,
i.invoice_total AS Amount,
ROUND(il.line_item_amount * 0.15, 2) AS Commission

FROM Vendors AS v JOIN Invoices AS i 
ON v.vendor_id = i.vendor_id

JOIN invoice_line_items AS il
ON i.invoice_id = il.invoice_id

WHERE line_item_amount >= 2000 and (invoice_date BETWEEN '2014-07-01' AND '2014-07-31') AND
(LOCATE(2, i.invoice_number) OR LOCATE(9, i.invoice_number))
ORDER BY invoice_date




