SELECT patient_id, patient_name, conditions
FROM Patients
WHERE conditions LIKE '%DIAB1%' AND conditions NOT LIKE '%SADIAB1%';
