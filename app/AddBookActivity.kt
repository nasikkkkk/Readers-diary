importExampleActivity : AppCompatActivity() {

    private lateinit var spinnerTextInputLayout: TextInputLayout
    private lateinit var spinnerAutoCompleteTextView: AutoCompleteTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner_example)

        spinnerTextInputLayout = findViewById(R.id.spinnerTextInputLayout)
        spinnerAutoCompleteTextView = findViewById(R.id.spinnerAutoCompleteTextView)

        // Создаем массив строк для опций выпадающего списка
        val spinnerOptions = arrayOf("Option 1", "Option 2", "Option 3", "Option 4")

        // Создаем ArrayAdapter, используя массив строк и макет для AutoCompleteTextView
        val adapter = ArrayAdapter(this, R.layout.spinner_list_item, spinnerOptions)

        // Устанавливаем адаптер для AutoCompleteTextView
        spinnerAutoCompleteTextView.setAdapter(adapter)

        // Обрабатываем выбор элемента
        spinnerAutoCompleteTextView.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position).toString()
            Toast.makeText(this, "Выбрано: $selectedItem", Toast.LENGTH_SHORT).show()
        }
    }
}
