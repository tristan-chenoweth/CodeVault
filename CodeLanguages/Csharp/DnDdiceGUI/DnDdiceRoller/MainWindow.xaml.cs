using System;
using System.Text;
using System.Windows;
using System.Windows.Controls;

namespace DnDDiceRoller
{
    public partial class MainWindow : Window
    {
        private Random rng = new Random();

        public MainWindow()
        {
            InitializeComponent();
            cmbDiceType.SelectedIndex = 1; // default to d6
        }

        private void btnRoll_Click(object sender, RoutedEventArgs e)
        {
            if (cmbDiceType.SelectedItem is not ComboBoxItem selectedItem)
                return;

            string diceType = selectedItem.Content.ToString() ?? "d6";
            int sides = int.Parse(diceType.Substring(1));

            if (!int.TryParse(txtDiceCount.Text, out int count) || count <= 0)
            {
                MessageBox.Show("Enter a valid number of dice.");
                return;
            }

            int total = 0;
            StringBuilder results = new();

            for (int i = 0; i < count; i++)
            {
                int roll = rng.Next(1, sides + 1);
                total += roll;
                results.AppendLine($"Roll {i + 1}: {roll}");
            }

            txtResults.Text = results.ToString();
            lblTotal.Content = $"Total: {total}";
        }
    }
}
