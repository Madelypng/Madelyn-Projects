SET @Csum := 0 ;
SET @Xsum := 0 ;

SELECT g.account_number AS GL, 
g.account_description AS Description,
il.line_item_description AS Exspenses,
il.line_item_amount AS Cost,
@Csum := (@Csum + il.line_item_amount) AS Running_Total,
CONCAT(round((il.line_item_amount/(@Xsum := @Xsum + il.line_item_amount)* 100),2),'%') AS Percent

FROM general_ledger_accounts AS g JOIN invoice_line_items AS il
ON g.account_number = il.account_number

WHERE g.account_description <> 'Freight' AND
g.account_description <> 'Telephone' 
ORDER BY Cost DESC