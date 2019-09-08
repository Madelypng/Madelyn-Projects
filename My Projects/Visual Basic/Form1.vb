Public Class Form1
	Private Sub butCalc_Click(sender As Object, e As EventArgs) Handles butCalc.Click
		Dim Order As Integer
		Dim Units As String
		Dim Cost As Integer

		Dim Costeach As Integer
		Dim Invalid As Integer

		Dim Conversion As Integer
		Dim OnHand As Integer
		Dim Value As Integer

		'Dim CS As Integer CS is 24
		'Dim PKG As Integer PKG is 6
		'Dim EA As Integer EA is 1 


		'Input 
		Integer.TryParse(txtOrder.Text, Order)
		Integer.TryParse(txtCS.Text, Cost)

		'Integer.TryParse(txtUnit.Text, Units)
		'Calculate 
		'THE ERROR MESSAGE 


		If txtUnit.Text = "EA" Then
			Conversion = 1

		ElseIf txtUnit.Text = "PKG" Then
			Conversion = 6

		ElseIf txtUnit.Text = "CS" Then
			Conversion = 24
		Else
			labInvalid.Visible = True
			txtUnit.Text = 0
		End If

		'OUTPUT
		txtOrder.Text = Convert.ToString(Order)
		'txtUnit.Text = Convert.ToString(Units)
		txtCS.Text = Convert.ToString(Cost)

		txtConvert.Text = Convert.ToString(Conversion)
		txtOnHand.Text = Convert.ToString(OnHand)
		txtValue.Text = Convert.ToString(Value)


		'Making Money 
		txtValue.Text = Value.ToString("n2")
		txtCS.Text = Cost.ToString("N2")

	End Sub
	'The Clear Button 
	Private Sub butClear_Click(sender As Object, e As EventArgs) Handles butClear.Click
		txtOrder.Text = String.Empty
		txtUnit.Text = String.Empty
		txtCS.Text = String.Empty
		txtConvert.Text = String.Empty
		txtOnHand.Text = String.Empty
		txtValue.Text = String.Empty
		labInvalid.Visible = False
	End Sub

	Private Sub butExit_Click(sender As Object, e As EventArgs) Handles butExit.Click
		Close()
	End Sub

	Private Sub labInvalid_Click(sender As Object, e As EventArgs) Handles labInvalid.Click

	End Sub
End Class
